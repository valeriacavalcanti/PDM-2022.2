//
//  Pessoa.swift
//  Agenda
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import Foundation

class Pessoa: NSObject, Identifiable{
    var nome: String
    var idade: Int
    
    override var description: String{
        return "\(nome) - \(idade)"
    }
    
    init(nome: String, idade: Int) {
        self.nome = nome
        self.idade = idade
    }
}
