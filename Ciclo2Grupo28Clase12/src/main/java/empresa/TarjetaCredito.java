
package empresa;

/**
 *
 * @author Usuario
 */
public class TarjetaCredito {

    Banco banco;
    Cliente cliente;

    TarjetaCredito(Banco b, Cliente cli) {
        this.banco = b;
        this.cliente=cli;
    }

}
