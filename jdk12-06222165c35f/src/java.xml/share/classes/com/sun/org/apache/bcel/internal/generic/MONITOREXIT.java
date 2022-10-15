/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 */
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sun.org.apache.bcel.internal.generic;

import com.sun.org.apache.bcel.internal.ExceptionConst;

/**
 * MONITOREXIT - Exit monitor for object
 * <PRE>Stack: ..., objectref -&gt; ...</PRE>
 *
 * @version $Id: MONITOREXIT.java 1747278 2016-06-07 17:28:43Z britter $
 * @LastModified: Oct 2017
 */
public class MONITOREXIT extends Instruction implements ExceptionThrower, StackConsumer {

    public MONITOREXIT() {
        super(com.sun.org.apache.bcel.internal.Const.MONITOREXIT, (short) 1);
    }


    @Override
    public Class<?>[] getExceptions() {
        return new Class<?>[] {
            ExceptionConst.NULL_POINTER_EXCEPTION
        };
    }


    /**
     * Call corresponding visitor method(s). The order is:
     * Call visitor methods of implemented interfaces first, then
     * call methods according to the class hierarchy in descending order,
     * i.e., the most specific visitXXX() call comes last.
     *
     * @param v Visitor object
     */
    @Override
    public void accept( final Visitor v ) {
        v.visitExceptionThrower(this);
        v.visitStackConsumer(this);
        v.visitMONITOREXIT(this);
    }
}
