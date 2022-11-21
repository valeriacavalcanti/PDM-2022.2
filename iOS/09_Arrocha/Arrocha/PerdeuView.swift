//
//  PerdeuView.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import SwiftUI

struct PerdeuView: View {
    @ObservedObject var jogoVM: JogoViewModel
    
    var body: some View {
        VStack{
            Spacer()
            Text("PERDEU!")
                .font(.largeTitle)
                .foregroundColor(Color.white)
            Spacer()
            Button("Voltar"){
                self.jogoVM.reset()
            }
            .background(Color.white)
            Spacer()
        }
        .frame(maxWidth: .infinity)
        .background(Color.red)
    }
}

struct PerdeuView_Previews: PreviewProvider {
    static var previews: some View {
        PerdeuView(jogoVM: JogoViewModel())
    }
}
