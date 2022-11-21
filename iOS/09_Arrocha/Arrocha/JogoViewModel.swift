//
//  JogoViewModel.swift
//  Arrocha
//
//  Created by Valéria Cavalcanti on 21/11/22.
//

import Foundation

class JogoViewModel: ObservableObject{
    @Published var status: Status
    @Published var menor:Int
    @Published var maior:Int
    var sorteio: Int
    
    init() {
        self.status = .EXECUTANDO
        self.menor = 1
        self.maior = 100
        self.sorteio = Int.random(in: 2 ... 99)
        
        print(self.sorteio)
    }
    
    func arrochado() -> Bool {
        return self.menor + 1 == self.maior - 1
    }
    
    func jogar(chute: Int){
//        print(chute, menor, maior, status)
        if (chute <= self.menor) || (chute >= self.maior) || (chute == self.sorteio){
            self.status = .PERDEU
        }else{
            if (chute < self.sorteio){
                self.menor = chute
            }else{
                self.maior = chute
            }
            if (self.arrochado()){
                self.status = .GANHOU
            }
        }
//        print(chute, menor, maior, status)
    }
    
    func reset() {
        self.status = .EXECUTANDO
        self.menor = 1
        self.maior = 100
        self.sorteio = Int.random(in: 2 ... 99)
        
        print(self.sorteio)
    }
}
