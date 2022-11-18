//
//  ControladorViewModel.swift
//  Controlador
//
//  Created by Valéria Cavalcanti on 04/11/22.
//

import Foundation

class ControladorViewModel: ObservableObject{
    @Published var qtde = 0
    
    func incrementar() {
        if (self.qtde < 10){
            self.qtde += 1
        }else{
            print("Nao consigo incrementar")
        }
    }
    
    func decrementar() {
        if (self.qtde > 0){
            self.qtde -= 1
        }else{
            print("Nao consigo decrementar")
        }
    }
}
