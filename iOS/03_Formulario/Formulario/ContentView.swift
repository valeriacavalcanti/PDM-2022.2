//
//  ContentView.swift
//  Formulario
//
//  Created by Valéria Cavalcanti on 07/11/22.
//

import SwiftUI

struct ContentView: View {
    @State var nome:String = ""
    @State var idade:Int = 0
    @State var dataHora: Date = Date()
    
    var body: some View {
        VStack {
            TextField("Digite seu nome", text: self.$nome)
            
            Text(self.nome.count.description)
            
            Stepper(value: self.$idade, in: 0...11){
//                Text("Idade: \(self.idade)")
                Label {
                    Text("Idade: \(self.idade)")
                        .font(.largeTitle)
                } icon: {
                    Image(systemName: "person.circle")
                        .font(.largeTitle)
                }
            }
            
            Botao(valor: self.$idade, incremento: 2)
            
            DatePicker("Escolha a Data", selection: self.$dataHora, displayedComponents: [.date])
            
            Label {
                Text(self.dataHora.description)
            } icon: {
                Image(systemName: "calendar.badge.clock")
            }

            Image("form")
                .resizable()
                .scaledToFit()
        }
        .padding()
    }
}

struct Botao: View{
    @Binding var valor:Int
    var incremento:Int
    
    var body: some View{
        Button("+"){
            self.valor += self.incremento
        }
        .font(.largeTitle)
        .frame(maxWidth: .infinity)
        .background(Color.blue)
        .foregroundColor(Color.white)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
