import tkinter as tk
from tkinter import messagebox

janela = tk.Tk()
janela.withdraw() # isso esconde a janela principal, deixa só o pop-up

messagebox.showinfo("Minha primeira janela","Hello World!")

print("Seu 'Hello World' funcionou!")