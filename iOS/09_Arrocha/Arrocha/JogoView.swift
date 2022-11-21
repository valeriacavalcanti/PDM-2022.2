//
//  JogoView.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import SwiftUI

struct JogoView: View {
    @State var chute:String = ""
    @ObservedObject var jogoVM: JogoViewModel
    
    var body: some View {
        VStack{
            Spacer()
            
            HStack{
                Text(self.jogoVM.menor.description)
                Text("e")
                Text(self.jogoVM.maior.description)
            }
            .font(.largeTitle)
            
            Spacer()
            
            TextField("Chute", text: self.$chute)
                .frame(width: 100)
                .background(Color.blue.opacity(0.4))
                .foregroundColor(Color.white)
            
            Spacer()
            
            Button("Chutar"){
                let valor = Int(self.chute) ?? 0
                self.jogoVM.jogar(chute: valor)
                self.chute = ""
            }
            
            Spacer()
        }
    }
}

struct JogoView_Previews: PreviewProvider {
    static var previews: some View {
        JogoView(jogoVM: JogoViewModel())
    }
}
