/*
 * Copyright (c) 2013-2018 Cinchapi Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.thrift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.server.AbstractNonblockingServer.*;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
/**
 * The base class for all exceptions that happen during (staged) operations in
 * a transaction.
 * <p>
 * All operations that occur within a transaction should be wrapped in a
 * try-catch block so that transaction exceptions can be caught and the
 * transaction can be properly aborted.
 * 
 * <pre>
 * try {
 *     concourse.stage();
 *     concourse.get(&quot;foo&quot;, 1);
 *     concourse.add(&quot;foo&quot;, &quot;bar&quot;, 1);
 *     concourse.commit();
 * }
 * catch (TransactionException e) {
 *     concourse.abort();
 * }
 * </pre>
 * 
 * </p>
 * <p>
 * <em>Please note that this and all descendant exceptions are unchecked for
 * backwards compatibility, but they may be changed to be checked in a future
 * API breaking release.</em>
 * </p>
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-9-30")
public class TransactionException extends TException implements
        org.apache.thrift.TBase<TransactionException, TransactionException._Fields>,
        java.io.Serializable,
        Cloneable,
        Comparable<TransactionException> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
            "TransactionException");

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
        schemes.put(StandardScheme.class,
                new TransactionExceptionStandardSchemeFactory());
        schemes.put(TupleScheme.class,
                new TransactionExceptionTupleSchemeFactory());
    }

    /**
     * The set of fields this struct contains, along with convenience methods
     * for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ;

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not
         * found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
            default:
                return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if(fields == null)
                throw new IllegalArgumentException(
                        "Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not
         * found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
                _Fields.class);
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData
                .addStructMetaDataMap(TransactionException.class, metaDataMap);
    }

    public TransactionException() {}

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public TransactionException(TransactionException other) {}

    public TransactionException deepCopy() {
        return new TransactionException(this);
    }

    @Override
    public void clear() {}

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned
     * a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if(field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if(that == null)
            return false;
        if(that instanceof TransactionException)
            return this.equals((TransactionException) that);
        return false;
    }

    public boolean equals(TransactionException that) {
        if(that == null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        return list.hashCode();
    }

    @Override
    public int compareTo(TransactionException other) {
        if(!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot)
            throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot)
            throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TransactionException(");
        boolean first = true;

        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(out)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in)
            throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(
                    new org.apache.thrift.transport.TIOStreamTransport(in)));
        }
        catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class TransactionExceptionStandardSchemeFactory
            implements SchemeFactory {
        public TransactionExceptionStandardScheme getScheme() {
            return new TransactionExceptionStandardScheme();
        }
    }

    private static class TransactionExceptionStandardScheme
            extends StandardScheme<TransactionException> {

        public void read(org.apache.thrift.protocol.TProtocol iprot,
                TransactionException struct)
                throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                default:
                    org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
                            schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be
            // checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot,
                TransactionException struct)
                throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class TransactionExceptionTupleSchemeFactory
            implements SchemeFactory {
        public TransactionExceptionTupleScheme getScheme() {
            return new TransactionExceptionTupleScheme();
        }
    }

    private static class TransactionExceptionTupleScheme
            extends TupleScheme<TransactionException> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot,
                TransactionException struct)
                throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot,
                TransactionException struct)
                throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
        }
    }

}
