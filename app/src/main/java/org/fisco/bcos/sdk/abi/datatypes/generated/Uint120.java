package org.fisco.bcos.sdk.abi.datatypes.generated;

import org.fisco.bcos.sdk.abi.datatypes.Uint;

import java.math.BigInteger;

/**
 * Auto generated code.
 *
 * <p><strong>Do not modifiy!</strong>
 *
 * <p>Please use AbiTypesGenerator in the <a
 * href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint120 extends Uint {
    public static final Uint120 DEFAULT = new Uint120(BigInteger.ZERO);

    public Uint120(BigInteger value) {
        super(120, value);
    }

    public Uint120(long value) {
        this(BigInteger.valueOf(value));
    }
}
