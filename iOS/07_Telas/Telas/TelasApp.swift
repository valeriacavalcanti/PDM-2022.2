//
//  TelasApp.swift
//  Telas
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

@main
struct TelasApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView(tvm: TelaViewModel())
        }
    }
}
