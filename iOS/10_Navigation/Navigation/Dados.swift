//
//  Dados.swift
//  Navigation
//
//  Created by Valéria Cavalcanti on 12/12/22.
//

import Foundation

class Dados: ObservableObject{
    @Published var nome:String
    @Published var lista:[String]
    
    init() {
        self.nome = "IFPB"
        self.lista = []
    }
}
