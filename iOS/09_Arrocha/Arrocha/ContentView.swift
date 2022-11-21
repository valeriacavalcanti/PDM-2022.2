//
//  ContentView.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import SwiftUI

struct ContentView: View {
    @ObservedObject var jogoVM: JogoViewModel
    
    var body: some View {
        if (self.jogoVM.status == .EXECUTANDO){
            JogoView(jogoVM: self.jogoVM)
        }else if (self.jogoVM.status == .GANHOU){
            GanhouView(jogoVM: self.jogoVM)
        }else{
            PerdeuView(jogoVM: self.jogoVM)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(jogoVM: JogoViewModel())
    }
}
