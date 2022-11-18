//
//  MainView.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct MainView: View {
    @ObservedObject var avm: AgendaViewModel
    
    var body: some View {
        VStack{
            Button("Novo"){
                self.avm.tela = .FORMULARIO
            }
            
//            Text(self.avm.lista.description)
//                .font(.largeTitle)
            List{
                ForEach(self.avm.lista){pessoa in
                    Text(pessoa.description)
                }
            }
            
            Spacer()
        }
    }
}

struct MainView_Previews: PreviewProvider {
    static var previews: some View {
        MainView(avm: AgendaViewModel())
    }
}
