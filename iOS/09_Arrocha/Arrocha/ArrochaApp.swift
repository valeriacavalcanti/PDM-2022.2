//
//  ArrochaApp.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import SwiftUI

@main
struct ArrochaApp: App {
    var jogoVM: JogoViewModel = JogoViewModel()
    
    var body: some Scene {
        WindowGroup {
            ContentView(jogoVM: self.jogoVM)
        }
    }
}
