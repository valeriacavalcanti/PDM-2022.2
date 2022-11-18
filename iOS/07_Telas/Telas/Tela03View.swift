//
//  Tela03View.swift
//  Telas
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct Tela03View: View {
    @ObservedObject var tvm: TelaViewModel
    
    var body: some View {
        VStack {
            Spacer()
            
            Image(systemName: "square.text.square")
                .imageScale(.large)
                .foregroundColor(.accentColor)
                .font(.largeTitle)
            Text("Tela 03")
                .font(.largeTitle)
            
            Spacer()
            
            HStack{
                Spacer()
                
                Button("Voltar"){
                    self.tvm.tela = .TELA01
                }
                .font(.largeTitle)
                
                Spacer()
            }
            Spacer()
        }
        .padding()
    }
}

struct Tela03View_Previews: PreviewProvider {
    static var previews: some View {
        Tela03View(tvm: TelaViewModel())
    }
}
