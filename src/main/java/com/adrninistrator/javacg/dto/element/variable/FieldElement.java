package com.adrninistrator.javacg.dto.element.variable;

import com.adrninistrator.javacg.common.JavaCGConstants;

/**
 * @author adrninistrator
 * @date 2022/10/5
 * @description: 字段
 */
public class FieldElement extends LocalVariableElement {

    // 字段名称
    protected final String fieldName;

    public FieldElement(String type, Object value, String fieldName) {
        super(type, value, JavaCGConstants.LOCAL_VARIABLE_INDEX_NOT_USED);

        this.fieldName = fieldName;
    }

    public FieldElement(String type, Object value, String fieldName, int index) {
        super(type, value, index);

        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String toString() {
        return "FieldElement{" +
                "simpleClassName='" + simpleClassName + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                ", fieldName='" + fieldName + '\'' +
                '}' + String.format(" (%x)", System.identityHashCode(this));
    }
}