//
//  ContentView.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct ContentView: View {
    @ObservedObject var avm: AgendaViewModel
    
    var body: some View {
        if (self.avm.tela == .PRINCIPAL){
            MainView(avm: self.avm)
        }else{
            FormView(avm: self.avm)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(avm: AgendaViewModel())
    }
}
