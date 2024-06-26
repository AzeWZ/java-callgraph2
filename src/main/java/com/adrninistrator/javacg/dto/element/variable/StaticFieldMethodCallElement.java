package com.adrninistrator.javacg.dto.element.variable;

import com.adrninistrator.javacg.common.JavaCGConstants;
import com.adrninistrator.javacg.dto.element.BaseElement;
import com.adrninistrator.javacg.util.JavaCGClassMethodUtil;

/**
 * @author adrninistrator
 * @date 2022/11/11
 * @description: 静态字段的方法调用
 */
public class StaticFieldMethodCallElement extends VariableElement {

    // 类名
    private final String className;

    // 字段名称
    private final String fieldName;

    // 调用的方法名称
    private final String methodName;

    public StaticFieldMethodCallElement(String type, boolean arrayElement, String className, String fieldName, String methodName) {
        super(type, arrayElement);
        this.className = className;
        this.fieldName = fieldName;
        this.methodName = methodName;
    }

    @Override
    public BaseElement copyElement() {
        StaticFieldMethodCallElement staticFieldMethodCallElementCopy = new StaticFieldMethodCallElement(getType(), arrayElement, className, fieldName, methodName);
        staticFieldMethodCallElementCopy.copyVariableDataSource(this);
        return staticFieldMethodCallElementCopy;
    }

    public String getInfo() {
        return JavaCGClassMethodUtil.genClassAndField(className, fieldName) + JavaCGConstants.FLAG_COLON + methodName + JavaCGConstants.EMPTY_METHOD_ARGS;
    }

    @Override
    public String toString() {
        return "StaticFieldMethodCallElement{" +
                "simpleClassName='" + simpleClassName + '\'' +
                ", type='" + getType() + '\'' +
                ", value=" + value +
                ", className='" + className + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }
}
