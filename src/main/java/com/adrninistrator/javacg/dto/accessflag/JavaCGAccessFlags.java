package com.adrninistrator.javacg.dto.accessflag;

import org.apache.bcel.classfile.AccessFlags;

/**
 * @author adrninistrator
 * @date 2022/12/7
 * @description:
 */
public class JavaCGAccessFlags extends AccessFlags {
    public JavaCGAccessFlags(int accessFlags) {
        super(accessFlags);
    }
}
