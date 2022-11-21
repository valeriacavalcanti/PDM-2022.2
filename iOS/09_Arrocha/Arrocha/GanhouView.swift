//
//  GanhouView.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import SwiftUI

struct GanhouView: View {
    @ObservedObject var jogoVM: JogoViewModel
    
    var body: some View {
        VStack{
            Spacer()
            Text("GANHOU!")
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
        .background(Color.green)
    }
}

struct GanhouView_Previews: PreviewProvider {
    static var previews: some View {
        GanhouView(jogoVM: JogoViewModel())
    }
}
