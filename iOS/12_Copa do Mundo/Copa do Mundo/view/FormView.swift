//
//  FormView.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import SwiftUI

struct FormView: View {
    @EnvironmentObject var cadastro: Cadastro
    @Environment(\.presentationMode) var presentationMode
    @State var nome:String = ""
    @State var nota:Int = 0
    
    var body: some View {
        VStack{
            Spacer()
            Image(systemName: "sportscourt")
                .font(.largeTitle)
            Spacer()
            TextField("Nome", text: self.$nome)
            Spacer()
            Stepper(value: self.$nota, in: 0 ... 10, step: 1){
                Label {
                    Text("Nota: \(self.nota)")
                } icon: {
                    Image(systemName: "flag")
                }
            }
            Spacer()
        }
        .navigationTitle("Formulário")
        .navigationBarTitleDisplayMode(.inline)
        .toolbar {
            Button("Salvar"){
                let s = Selecao(nome: self.nome, nota: self.nota)
                self.cadastro.lista.append(s)
                self.presentationMode.wrappedValue.dismiss()
            }
        }
        .padding()
    }
}

struct FormView_Previews: PreviewProvider {
    static var previews: some View {
        FormView()
    }
}
