//
//  main.swift
//  Linguagem
//
//  Created by Valéria Cavalcanti on 04/11/22.
//

import Foundation

extension String{
    func contaVogais() -> Int {
        var qtde = 0
        let VOGAIS = "AEIOU"
        self.forEach { s in
            if (VOGAIS.contains(s.uppercased())){
                qtde += 1
            }
        }
        return qtde
    }
}

var nome = "Valeria Maria"

print(nome)
print(nome.uppercased())
print(nome.contains("a"))
print(nome)
print(nome.contaVogais())
