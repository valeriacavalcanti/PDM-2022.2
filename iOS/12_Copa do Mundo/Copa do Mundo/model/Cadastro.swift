//
//  Cadastro.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import Foundation

// ObservableObject: será um StateObject

class Cadastro : ObservableObject{
    
    @Published var lista:[Selecao]
    
    init() {
        self.lista = []
    }
}
