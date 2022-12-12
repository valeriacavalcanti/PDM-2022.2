//
//  Tela01View.swift
//  Navigation
//
//  Created by Valéria Cavalcanti on 12/12/22.
//

import SwiftUI

struct Tela01View: View {
    @EnvironmentObject var dados: Dados
    
    var body: some View {
        ZStack{
            Color.gray
                .opacity(0.4)
                .ignoresSafeArea()
            ZStack{
                Color.white
                VStack{
                    Text("Tela 01 " + self.dados.nome)
                        .font(.largeTitle)
                    Button("Add"){
                        self.dados.lista.append("01")
                    }
                    Text(self.dados.lista.count.description)
                }
                .navigationTitle("Tela 01")
                .navigationBarTitleDisplayMode(.inline)
                .toolbar {
                    ToolbarItem {
                        NavigationLink(destination: Tela02View()) {
//                            Image(systemName: "folder")
                            Text("Tela 02")
                        }
                    }
                }
            }
        }
        .onAppear(){
            print(self.dados.lista)
        }
    }
}

struct Tela01View_Previews: PreviewProvider {
    static var previews: some View {
        Tela01View()
    }
}
