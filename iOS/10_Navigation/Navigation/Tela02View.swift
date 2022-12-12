//
//  Tela02View.swift
//  Navigation
//
//  Created by Valéria Cavalcanti on 12/12/22.
//

import SwiftUI

struct Tela02View: View {
    @EnvironmentObject var dados: Dados
    
    var body: some View {
        ZStack{
            Color.blue
                .opacity(0.4)
                .ignoresSafeArea()
            ZStack{
                Color.white
                VStack{
                    Text("Tela 02 " + self.dados.nome)
                        .font(.largeTitle)
                    Button("Add"){
                        self.dados.lista.append("02")
                    }
                }
                .navigationTitle("Tela 02")
                .navigationBarTitleDisplayMode(.inline)
                .toolbar {
                    ToolbarItem {
                        NavigationLink(destination: Tela03View()) {
//                            Image(systemName: "folder")
                            Text("Tela 03")
                        }
                    }
                }
            }
        }
    }
}

struct Tela02View_Previews: PreviewProvider {
    static var previews: some View {
        Tela02View()
    }
}
