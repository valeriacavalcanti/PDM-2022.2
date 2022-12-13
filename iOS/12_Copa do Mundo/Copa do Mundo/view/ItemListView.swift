//
//  ItemListView.swift
//  Copa do Mundo
//
//  Created by Valéria Cavalcanti on 13/12/22.
//

import SwiftUI

struct ItemListView: View {
    var selecao: Selecao
    
    var body: some View {
        HStack{
//            Image(systemName: "person.fill")
//                .font(.title)
//                .foregroundColor(Color.red)
//            Text(selecao.nome)
//                .font(.title)
            NavigationLink(destination: Text(selecao.nome)) {
                Text(selecao.nome)
            }
        }
    }
}

struct ItemListView_Previews: PreviewProvider {
    static var previews: some View {
        ItemListView(selecao: Selecao(nome: "Croacia", nota: 0))
    }
}
