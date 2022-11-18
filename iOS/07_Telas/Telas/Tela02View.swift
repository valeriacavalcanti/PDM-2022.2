//
//  Tela02View.swift
//  Telas
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct Tela02View: View {
    @ObservedObject var tvm: TelaViewModel
    
    var body: some View {
        VStack {
            Spacer()
            
            Image(systemName: "macwindow")
                .imageScale(.large)
                .foregroundColor(.accentColor)
                .font(.largeTitle)
            Text("Tela 02")
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

struct Tela02View_Previews: PreviewProvider {
    static var previews: some View {
        Tela02View(tvm: TelaViewModel())
    }
}
