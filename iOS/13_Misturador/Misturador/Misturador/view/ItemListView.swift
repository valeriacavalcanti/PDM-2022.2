//
//  ItemListView.swift
//  Misturador
//
//  Created by Valéria Cavalcanti on 16/12/22.
//

import SwiftUI

struct ItemListView: View {
    var cor: Cor
    
    var body: some View {
        HStack{
            Circle()
                .frame(height: 40)
                .foregroundColor(Color(red: cor.red, green: cor.green, blue: cor.blue))
                .shadow(radius: 2)
            Text(cor.nome ?? "-")
            Spacer()
        }
    }
}

struct ItemListView_Previews: PreviewProvider {
    static var previews: some View {
        ItemListView(cor: Cor())
    }
}
