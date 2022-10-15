/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/scenarios/multienv/MA01/ma01t001.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *     This test is for MA01 scenario of "multiple environments support".
 *     The test checks if VM can start with two different agents of
 *     different libraries. The libraries are specified by -agentlib
 *     command line argument with different options (opt1 and opt2)
 *     and the test checks if these options are correctly passed to
 *     the start-up routines of the agents.
 * COMMENTS
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @build ExecDriver
 *        nsk.jvmti.scenarios.multienv.MA01.ma01t001
 * @run main/othervm/native PropertyResolvingWrapper ExecDriver --java
 *      "-agentlib:ma01t001=opt1=opt1 -waittime=5"
 *      "-agentlib:ma01t001a=opt2=opt2 -waittime=5"
 *      nsk.jvmti.scenarios.multienv.MA01.ma01t001
 */

