//
//  FormView.swift
//  Misturador
//
//  Created by Valéria Cavalcanti on 16/12/22.
//

import SwiftUI

struct FormView: View {
    @Environment(\.managedObjectContext) private var viewContext
    @Environment(\.presentationMode) private var presentationMode
    @State var nome: String = ""
    @State var red:Double = 0
    @State var green:Double = 0
    @State var blue:Double = 0
    
    var body: some View {
        VStack{
            Spacer()
            nomeCor
            Spacer()
            sliderRed
            Spacer()
            sliderGreen
            Spacer()
            sliderBlue
            Spacer()
            previewColor
        }
        .navigationTitle("Cor")
        .toolbar {
            ToolbarItem {
                Button("Salvar"){
                    let cor = Cor(context: viewContext)
                    
                    cor.nome = self.nome
                    cor.red = self.red
                    cor.green = self.green
                    cor.blue = self.blue

                    do {
                        try viewContext.save()
                    } catch {
                        let nsError = error as NSError
                        fatalError("Unresolved error \(nsError), \(nsError.userInfo)")
                    }
                    
                    self.presentationMode.wrappedValue.dismiss()
                }
            }
        }
        .padding()
    }
}

extension FormView{
    var nomeCor: some View{
        TextField("Nome da Cor", text: self.$nome)
            .padding()
            .border(.gray)
    }
}

extension FormView{
    var sliderRed: some View{
        VStack{
            Slider(value: self.$red, in: 0...1, step: 0.01)
                .colorMultiply(.red)
            Text("\(Int(self.red * 100)) %")
                .foregroundColor(.red)
        }
    }
}

extension FormView{
    var sliderGreen: some View{
        VStack{
            Slider(value: self.$green, in: 0...1, step: 0.01)
                .colorMultiply(.green)
            Text("\(Int(self.green * 100)) %")
                .foregroundColor(.green)
        }
    }
}

extension FormView{
    var sliderBlue: some View{
        VStack{
            Slider(value: self.$blue, in: 0...1, step: 0.01)
                .colorMultiply(.blue)
            Text("\(Int(self.blue * 100)) %")
                .foregroundColor(.blue)
        }
    }
}

extension FormView{
    var previewColor: some View{
        VStack{
            Rectangle()
                .frame(height:200)
                .foregroundColor(Color(red: self.red, green:self.green, blue: self.blue))
        }
    }
}

struct FormView_Previews: PreviewProvider {
    static var previews: some View {
        FormView()
    }
}
