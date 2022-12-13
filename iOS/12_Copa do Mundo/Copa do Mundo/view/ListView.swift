//
//  ListView.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import SwiftUI

struct ListView: View {
    @EnvironmentObject var cadastro: Cadastro
    
    var body: some View {
        VStack{
            List{
                ForEach(self.cadastro.lista){ selecao in
                    ItemListView(selecao: selecao)
                }
                .onDelete(perform: delete)
            }
        }
        .navigationTitle("Lista")
        .toolbar {
            ToolbarItem {
                NavigationLink(destination: FormView()) {
                    Image(systemName: "plus")
                }
            }
        }
        .onAppear(){
            print(self.cadastro.lista)
        }
    }
    
    func delete(indexSet: IndexSet){
        self.cadastro.lista.remove(atOffsets: indexSet)
    }
}

struct ListView_Previews: PreviewProvider {
    static var previews: some View {
        ListView()
    }
}
