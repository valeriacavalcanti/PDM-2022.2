//
//  ContentView.swift
//  Controlador
//
//  Created by Valéria Cavalcanti on 04/11/22.
//

import SwiftUI

struct ContentView: View {
//    @State var qtde = 0
    @ObservedObject var cvm = ControladorViewModel()
    
    var body: some View {
        VStack{
            Spacer()
            texto
            Spacer()
            botoes
            Spacer()
        }
    }
}

extension ContentView{
    var texto: some View{
        Text(self.cvm.qtde.description)
            .font(.largeTitle)
            .padding()
    }
}

extension ContentView{
    var btAdd: some View{
        Button("+"){
//            self.qtde += 1
            self.cvm.incrementar()
        }
        .font(.largeTitle)
    }
}

extension ContentView{
    var btDel: some View{
        Button("-"){
//            if (self.qtde > 0){
//                self.qtde -= 1
//            }
            self.cvm.decrementar()
        }
        .font(.largeTitle)
    }
}

extension ContentView{
    var botoes: some View{
        HStack{
            Spacer()
            btAdd
            Spacer()
            btDel
            Spacer()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
