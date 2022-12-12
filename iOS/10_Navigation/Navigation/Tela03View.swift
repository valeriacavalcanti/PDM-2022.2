//
//  Tela03View.swift
//  Navigation
//
//  Created by Valéria Cavalcanti on 12/12/22.
//

import SwiftUI

struct Tela03View: View {
    @EnvironmentObject var dados: Dados
    
    var body: some View {
        ZStack{
            Color.red
                .opacity(0.4)
                .ignoresSafeArea()
            ZStack{
                Color.white
                VStack{
                    Text("Tela 03 " + self.dados.nome)
                        .font(.largeTitle)
                    Button("Add"){
                        self.dados.lista.append("03")
                    }
                }
                .navigationTitle("Tela 03")
                .navigationBarTitleDisplayMode(.inline)
            }
        }
    }
}

struct Tela03View_Previews: PreviewProvider {
    static var previews: some View {
        Tela03View()
    }
}
