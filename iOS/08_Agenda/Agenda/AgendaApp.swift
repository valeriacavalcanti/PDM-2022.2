//
//  AgendaApp.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

@main
struct AgendaApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView(avm: AgendaViewModel())
        }
    }
}
