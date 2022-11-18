//
//  FormView.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct FormView: View {
    @ObservedObject var avm: AgendaViewModel
    @State var nome: String = ""
    @State var idade: String = ""
    
    var body: some View {
        VStack{
            Spacer()
            Text("Nova Pessoa")
                .font(.largeTitle)
            
            Spacer()
            
            TextField("Nome", text: self.$nome)
            
            Spacer()
            
            TextField("Idade", text: self.$idade)
            
            Spacer()
            
            HStack{
                Button("Salvar"){
                    let idade = Int(self.idade) ?? -1
                    let p = Pessoa(nome: self.nome, idade: idade)
                     self.avm.tela = .PRINCIPAL
                }
                
                Button("Cancelar"){
                    self.avm.tela = .PRINCIPAL
                }
            }
            Spacer()
        }
        .padding()
    }
}

struct FormView_Previews: PreviewProvider {
    static var previews: some View {
        FormView(avm: AgendaViewModel())
    }
}
