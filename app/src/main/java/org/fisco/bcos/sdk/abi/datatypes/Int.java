package org.fisco.bcos.sdk.abi.datatypes;

import org.fisco.bcos.sdk.abi.Constant;

import java.math.BigInteger;

/**
 * Integer type.
 */
public class Int extends IntType {

    public static final String TYPE_NAME = "int";
    public static final Int DEFAULT = new Int(BigInteger.ZERO);

    public Int(BigInteger value) {
        // "int" values should be declared as int256 in computing function selectors
        this(MAX_BIT_LENGTH, value);
    }

    protected Int(int bitSize, BigInteger value) {
        super(TYPE_NAME, bitSize, value);
    }

    /**
     * check if value between MIN_INT256 ~ MIN_INT256
     *
     * @param value the value need to be checked
     * @return true/false
     */
    public boolean validInt(BigInteger value) {
        return value.compareTo(Constant.MIN_INT256) >= 0
                && value.compareTo(Constant.MAX_INT256) <= 0;
    }

    @Override
    boolean valid(int bitSize, BigInteger value) {
        return super.valid(bitSize, value) && validInt(value);
    }

    @Override
    public boolean dynamicType() {
        return false;
    }

    @Override
    public int offset() {
        return 1;
    }
}
