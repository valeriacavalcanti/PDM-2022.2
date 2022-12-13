//
//  ContentView.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import SwiftUI

struct ContentView: View {
    @StateObject var cadastro = Cadastro()
    
    var body: some View {
        NavigationView{
            ListView()
        }
        .environmentObject(self.cadastro)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
