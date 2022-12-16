//
//  ListView.swift
//  Misturador
//
//  Created by Valéria Cavalcanti on 16/12/22.
//

import SwiftUI
import CoreData

struct ListView: View {
    @Environment(\.managedObjectContext) private var viewContext
    
    @FetchRequest(
        sortDescriptors: [NSSortDescriptor(keyPath: \Cor.nome, ascending: true)],
        animation: .default)
    private var cores: FetchedResults<Cor>
    
    var body: some View {
        List {
            ForEach(cores) { cor in
                NavigationLink(destination: Color(red: cor.red, green: cor.green, blue: cor.blue).navigationTitle(cor.nome ?? "-")) {
                    ItemListView(cor: cor)
                }
            }
            .onDelete(perform: deleteItems)
        }
        .navigationTitle("Cores")
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            ToolbarItem(placement: .navigationBarLeading) {
                EditButton()
            }
            ToolbarItem{
                NavigationLink(destination: FormView()) {
                    Image(systemName: "plus")
                }
            }
        }
    }
    
    private func deleteItems(offsets: IndexSet) {
        withAnimation {
            offsets.map { cores[$0] }.forEach(viewContext.delete)

            do {
                try viewContext.save()
            } catch {
                // Replace this implementation with code to handle the error appropriately.
                // fatalError() causes the application to generate a crash log and terminate. You should not use this function in a shipping application, although it may be useful during development.
                let nsError = error as NSError
                fatalError("Unresolved error \(nsError), \(nsError.userInfo)")
            }
        }
    }
}

struct ListView_Previews: PreviewProvider {
    static var previews: some View {
        ListView()
    }
}
