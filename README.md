# BANK ACCOUNT KATA

### 👀 **Objetivo:**

- Desarrollar un sistema simple de gestión de cuentas bancarias que permita a los usuarios realizar operaciones básicas como depositar dinero, retirar dinero y consultar el saldo. Este ejercicio te ayudará a practicar la programación orientada a objetos (OOP), el manejo de estados, y el diseño de una API sencilla.

### 🏁 **Contexto:**

- Eres responsable de implementar la lógica para un sistema de gestión de cuentas bancarias. Los usuarios de este sistema deben poder crear cuentas, depositar dinero, retirar dinero y consultar el saldo actual de sus cuentas.

### 😮‍💨 **Requerimientos:**

1. **Crear una Cuenta:**
    - El saldo inicial puede ser cero o una cantidad especificada durante la creación de la cuenta.
2. **Depositar Dinero:**
    - Los usuarios deben poder depositar una cantidad positiva de dinero en su cuenta.
    - Después de un depósito, el saldo de la cuenta debe incrementarse en la cantidad depositada.

3. **Retirar Dinero:**
    - Los usuarios deben poder retirar dinero de su cuenta.
    - El sistema debe verificar que la cuenta tenga suficientes fondos antes de permitir una retirada. Si no hay suficientes fondos, la transacción debe ser rechazada y el saldo no debe cambiar.
    - Después de una retirada exitosa, el saldo de la cuenta debe disminuir en la cantidad retirada.
4. **Consultar el Saldo:**
    - Los usuarios deben poder consultar el saldo actual de su cuenta en cualquier momento.
    - El saldo debe reflejar todas las operaciones anteriores (depósitos y retiradas).

**Reglas:**

- No se permite retirar más dinero del que hay disponible en la cuenta.
- El número de cuenta debe ser único para cada cuenta.
- Los depósitos y retiradas deben ser cantidades positivas.