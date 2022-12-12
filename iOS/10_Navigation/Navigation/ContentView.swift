//
//  ContentView.swift
//  Navigation
//
//  Created by Valéria Cavalcanti on 12/12/22.
//

import SwiftUI

struct ContentView: View {
    @StateObject var dados = Dados()
    
    var body: some View {
        NavigationView {
            Tela01View()
        }
        .environmentObject(self.dados)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
