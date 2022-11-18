//
//  AgendaViewModel.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import Foundation

class AgendaViewModel: ObservableObject{
    @Published var tela: Tela = .PRINCIPAL
    var lista:[Pessoa]
    
    init() {
        self.lista = []
    }
}
