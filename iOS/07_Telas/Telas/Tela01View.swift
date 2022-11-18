//
//  Tela01View.swift
//  Telas
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct Tela01View: View {
    @ObservedObject var tvm: TelaViewModel
    
    var body: some View {
        VStack {
            Spacer()
            
            Image(systemName: "person.fill")
                .imageScale(.large)
                .foregroundColor(.accentColor)
                .font(.largeTitle)
            Text("Tela 01")
                .font(.largeTitle)
            
            Spacer()
            
            HStack{
                Spacer()
                
                Button("Tela 02"){
                    self.tvm.tela = .TELA02
                }
                .font(.largeTitle)
                
                Spacer()
                
                Button("Tela 03"){
                    self.tvm.tela = .TELA03
                }
                .font(.largeTitle)
                
                Spacer()
            }
            Spacer()
        }
        .padding()
    }
}

struct Tela01View_Previews: PreviewProvider {
    static var previews: some View {
        Tela01View(tvm: TelaViewModel())
    }
}
