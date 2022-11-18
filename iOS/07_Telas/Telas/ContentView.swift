//
//  ContentView.swift
//  Telas
//
//  Created by Valéria Cavalcanti on 18/11/22.
//

import SwiftUI

struct ContentView: View {
    @ObservedObject var tvm: TelaViewModel
    
    var body: some View {
        VStack {
            if (self.tvm.tela == .TELA01){
                Tela01View(tvm: self.tvm)
            }else if (self.tvm.tela == .TELA02){
                Tela02View(tvm: self.tvm)
            }else{
                Tela03View(tvm: self.tvm)
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView(tvm: TelaViewModel())
    }
}
