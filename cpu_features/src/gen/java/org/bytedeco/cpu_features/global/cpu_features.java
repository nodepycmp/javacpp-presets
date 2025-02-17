// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features.global;

import org.bytedeco.cpu_features.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class cpu_features extends org.bytedeco.cpu_features.presets.cpu_features {
    static { Loader.load(); }

// Parsed from cpu_features/cpu_features_macros.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPU_FEATURES_MACROS_H_
// #define CPU_FEATURES_INCLUDE_CPU_FEATURES_MACROS_H_

////////////////////////////////////////////////////////////////////////////////
// Architectures
////////////////////////////////////////////////////////////////////////////////

// #if defined(__pnacl__) || defined(__CLR_VER)
// #define CPU_FEATURES_ARCH_VM
// #endif

// #if (defined(_M_IX86) || defined(__i386__)) && !defined(CPU_FEATURES_ARCH_VM)
// #define CPU_FEATURES_ARCH_X86_32
// #endif

// #if (defined(_M_X64) || defined(__x86_64__)) && !defined(CPU_FEATURES_ARCH_VM)
// #define CPU_FEATURES_ARCH_X86_64
// #endif

// #if defined(CPU_FEATURES_ARCH_X86_32) || defined(CPU_FEATURES_ARCH_X86_64)
// #define CPU_FEATURES_ARCH_X86
// #endif

// #if (defined(__arm__) || defined(_M_ARM))
// #define CPU_FEATURES_ARCH_ARM
// #endif

// #if defined(__aarch64__)
// #define CPU_FEATURES_ARCH_AARCH64
// #endif

// #if (defined(CPU_FEATURES_ARCH_AARCH64) || defined(CPU_FEATURES_ARCH_ARM))
// #define CPU_FEATURES_ARCH_ANY_ARM
// #endif

// #if defined(__mips64)
// #define CPU_FEATURES_ARCH_MIPS64
// #endif

// #if defined(__mips__) && !defined(__mips64)  // mips64 also declares __mips__
// #define CPU_FEATURES_ARCH_MIPS32
// #endif

// #if defined(CPU_FEATURES_ARCH_MIPS32) || defined(CPU_FEATURES_ARCH_MIPS64)
// #define CPU_FEATURES_ARCH_MIPS
// #endif

// #if defined(__powerpc__)
// #define CPU_FEATURES_ARCH_PPC
// #endif

////////////////////////////////////////////////////////////////////////////////
// Os
////////////////////////////////////////////////////////////////////////////////

// #if defined(__linux__)
// #define CPU_FEATURES_OS_LINUX_OR_ANDROID
// #endif

// #if defined(__ANDROID__)
// #define CPU_FEATURES_OS_ANDROID
// #endif

// #if (defined(_WIN64) || defined(_WIN32))
// #define CPU_FEATURES_OS_WINDOWS
// #endif

////////////////////////////////////////////////////////////////////////////////
// Compilers
////////////////////////////////////////////////////////////////////////////////

// #if defined(__clang__)
// #define CPU_FEATURES_COMPILER_CLANG
// #endif

// #if defined(__GNUC__) && !defined(__clang__)
// #define CPU_FEATURES_COMPILER_GCC
// #endif

// #if defined(_MSC_VER)
// #define CPU_FEATURES_COMPILER_MSC
// #endif

////////////////////////////////////////////////////////////////////////////////
// Cpp
////////////////////////////////////////////////////////////////////////////////

// #if defined(__cplusplus)
// #define CPU_FEATURES_START_CPP_NAMESPACE
//   namespace cpu_features {
//   extern "C" {
// #define CPU_FEATURES_END_CPP_NAMESPACE
//   }
//   }
// #else
// #endif

////////////////////////////////////////////////////////////////////////////////
// Compiler flags
////////////////////////////////////////////////////////////////////////////////

// Use the following to check if a feature is known to be available at
// compile time. See README.md for an example.
// #if defined(CPU_FEATURES_ARCH_X86)
// #define CPU_FEATURES_COMPILED_X86_AES defined(__AES__)
// #define CPU_FEATURES_COMPILED_X86_F16C defined(__F16C__)
// #define CPU_FEATURES_COMPILED_X86_BMI defined(__BMI__)
// #define CPU_FEATURES_COMPILED_X86_BMI2 defined(__BMI2__)
// #define CPU_FEATURES_COMPILED_X86_SSE (defined(__SSE__) || (_M_IX86_FP >= 1))
// #define CPU_FEATURES_COMPILED_X86_SSE2 (defined(__SSE2__) || (_M_IX86_FP >= 2))
// #define CPU_FEATURES_COMPILED_X86_SSE3 defined(__SSE3__)
// #define CPU_FEATURES_COMPILED_X86_SSSE3 defined(__SSSE3__)
// #define CPU_FEATURES_COMPILED_X86_SSE4_1 defined(__SSE4_1__)
// #define CPU_FEATURES_COMPILED_X86_SSE4_2 defined(__SSE4_2__)
// #define CPU_FEATURES_COMPILED_X86_AVX defined(__AVX__)
// #define CPU_FEATURES_COMPILED_x86_AVX2 defined(__AVX2__)
// #endif

// #if defined(CPU_FEATURES_ARCH_ANY_ARM)
// #define CPU_FEATURES_COMPILED_ANY_ARM_NEON defined(__ARM_NEON__)
// #endif

// #if defined(CPU_FEATURES_ARCH_MIPS)
// #define CPU_FEATURES_COMPILED_MIPS_MSA defined(__mips_msa)
// #endif

// #endif  // CPU_FEATURES_INCLUDE_CPU_FEATURES_MACROS_H_


// Parsed from cpu_features/cpu_features_cache_info.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_COMMON_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_COMMON_H_

// #include "cpu_features_macros.h"

/** enum cpu_features::CacheType */
public static final int
  CPU_FEATURE_CACHE_NULL = 0,
  CPU_FEATURE_CACHE_DATA = 1,
  CPU_FEATURE_CACHE_INSTRUCTION = 2,
  CPU_FEATURE_CACHE_UNIFIED = 3,
  CPU_FEATURE_CACHE_TLB = 4,
  CPU_FEATURE_CACHE_DTLB = 5,
  CPU_FEATURE_CACHE_STLB = 6,
  CPU_FEATURE_CACHE_PREFETCH = 7;
// Targeting ../CacheLevelInfo.java



// Increase this value if more cache levels are needed.
// #ifndef CPU_FEATURES_MAX_CACHE_LEVEL
public static final int CPU_FEATURES_MAX_CACHE_LEVEL = 10;
// Targeting ../CacheInfo.java


  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_COMMON_H_


// Parsed from cpu_features/internal/hwcaps.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Interface to retrieve hardware capabilities. It relies on Linux's getauxval
// or `/proc/self/auxval` under the hood.
// #ifndef CPU_FEATURES_INCLUDE_INTERNAL_HWCAPS_H_
// #define CPU_FEATURES_INCLUDE_INTERNAL_HWCAPS_H_

// #include <stdint.h>
// #include "cpu_features/cpu_features_macros.h"

// To avoid depending on the linux kernel we reproduce the architecture specific
// constants here.

// http://elixir.free-electrons.com/linux/latest/source/arch/arm64/include/uapi/asm/hwcap.h
public static final long AARCH64_HWCAP_FP = (1L << 0);
public static final long AARCH64_HWCAP_ASIMD = (1L << 1);
public static final long AARCH64_HWCAP_AES = (1L << 3);
public static final long AARCH64_HWCAP_PMULL = (1L << 4);
public static final long AARCH64_HWCAP_SHA1 = (1L << 5);
public static final long AARCH64_HWCAP_SHA2 = (1L << 6);
public static final long AARCH64_HWCAP_CRC32 = (1L << 7);

// http://elixir.free-electrons.com/linux/latest/source/arch/arm/include/uapi/asm/hwcap.h
public static final long ARM_HWCAP_SWP = (1L << 0);
public static final long ARM_HWCAP_HALF = (1L << 1);
public static final long ARM_HWCAP_THUMB = (1L << 2);
public static final long ARM_HWCAP_26BIT = (1L << 3);
public static final long ARM_HWCAP_FAST_MULT = (1L << 4);
public static final long ARM_HWCAP_FPA = (1L << 5);
public static final long ARM_HWCAP_VFP = (1L << 6);
public static final long ARM_HWCAP_EDSP = (1L << 7);
public static final long ARM_HWCAP_JAVA = (1L << 8);
public static final long ARM_HWCAP_IWMMXT = (1L << 9);
public static final long ARM_HWCAP_CRUNCH = (1L << 10);
public static final long ARM_HWCAP_THUMBEE = (1L << 11);
public static final long ARM_HWCAP_NEON = (1L << 12);
public static final long ARM_HWCAP_VFPV3 = (1L << 13);
public static final long ARM_HWCAP_VFPV3D16 = (1L << 14);
public static final long ARM_HWCAP_TLS = (1L << 15);
public static final long ARM_HWCAP_VFPV4 = (1L << 16);
public static final long ARM_HWCAP_IDIVA = (1L << 17);
public static final long ARM_HWCAP_IDIVT = (1L << 18);
public static final long ARM_HWCAP_VFPD32 = (1L << 19);
public static final long ARM_HWCAP_LPAE = (1L << 20);
public static final long ARM_HWCAP_EVTSTRM = (1L << 21);
public static final long ARM_HWCAP2_AES = (1L << 0);
public static final long ARM_HWCAP2_PMULL = (1L << 1);
public static final long ARM_HWCAP2_SHA1 = (1L << 2);
public static final long ARM_HWCAP2_SHA2 = (1L << 3);
public static final long ARM_HWCAP2_CRC32 = (1L << 4);

// http://elixir.free-electrons.com/linux/latest/source/arch/mips/include/uapi/asm/hwcap.h
public static final long MIPS_HWCAP_R6 = (1L << 0);
public static final long MIPS_HWCAP_MSA = (1L << 1);
public static final long MIPS_HWCAP_CRC32 = (1L << 2);

// http://elixir.free-electrons.com/linux/latest/source/arch/powerpc/include/uapi/asm/cputable.h
// #ifndef _UAPI__ASM_POWERPC_CPUTABLE_H
/* in AT_HWCAP */
public static final int PPC_FEATURE_32 = 0x80000000;
public static final int PPC_FEATURE_64 = 0x40000000;
public static final int PPC_FEATURE_601_INSTR = 0x20000000;
public static final int PPC_FEATURE_HAS_ALTIVEC = 0x10000000;
public static final int PPC_FEATURE_HAS_FPU = 0x08000000;
public static final int PPC_FEATURE_HAS_MMU = 0x04000000;
public static final int PPC_FEATURE_HAS_4xxMAC = 0x02000000;
public static final int PPC_FEATURE_UNIFIED_CACHE = 0x01000000;
public static final int PPC_FEATURE_HAS_SPE = 0x00800000;
public static final int PPC_FEATURE_HAS_EFP_SINGLE = 0x00400000;
public static final int PPC_FEATURE_HAS_EFP_DOUBLE = 0x00200000;
public static final int PPC_FEATURE_NO_TB = 0x00100000;
public static final int PPC_FEATURE_POWER4 = 0x00080000;
public static final int PPC_FEATURE_POWER5 = 0x00040000;
public static final int PPC_FEATURE_POWER5_PLUS = 0x00020000;
public static final int PPC_FEATURE_CELL = 0x00010000;
public static final int PPC_FEATURE_BOOKE = 0x00008000;
public static final int PPC_FEATURE_SMT = 0x00004000;
public static final int PPC_FEATURE_ICACHE_SNOOP = 0x00002000;
public static final int PPC_FEATURE_ARCH_2_05 = 0x00001000;
public static final int PPC_FEATURE_PA6T = 0x00000800;
public static final int PPC_FEATURE_HAS_DFP = 0x00000400;
public static final int PPC_FEATURE_POWER6_EXT = 0x00000200;
public static final int PPC_FEATURE_ARCH_2_06 = 0x00000100;
public static final int PPC_FEATURE_HAS_VSX = 0x00000080;

public static final int PPC_FEATURE_PSERIES_PERFMON_COMPAT = 0x00000040;

/* Reserved - do not use                0x00000004 */
public static final int PPC_FEATURE_TRUE_LE = 0x00000002;
public static final int PPC_FEATURE_PPC_LE = 0x00000001;

/* in AT_HWCAP2 */
public static final int PPC_FEATURE2_ARCH_2_07 = 0x80000000;
public static final int PPC_FEATURE2_HTM = 0x40000000;
public static final int PPC_FEATURE2_DSCR = 0x20000000;
public static final int PPC_FEATURE2_EBB = 0x10000000;
public static final int PPC_FEATURE2_ISEL = 0x08000000;
public static final int PPC_FEATURE2_TAR = 0x04000000;
public static final int PPC_FEATURE2_VEC_CRYPTO = 0x02000000;
public static final int PPC_FEATURE2_HTM_NOSC = 0x01000000;
public static final int PPC_FEATURE2_ARCH_3_00 = 0x00800000;
public static final int PPC_FEATURE2_HAS_IEEE128 = 0x00400000;
public static final int PPC_FEATURE2_DARN = 0x00200000;
public static final int PPC_FEATURE2_SCV = 0x00100000;
public static final int PPC_FEATURE2_HTM_NO_SUSPEND = 0x00080000;
// Targeting ../HardwareCapabilities.java



@Namespace("cpu_features") public static native @ByVal HardwareCapabilities CpuFeatures_GetHardwareCapabilities();
// Targeting ../PlatformType.java



@Namespace("cpu_features") public static native @ByVal PlatformType CpuFeatures_GetPlatformType();

// #if defined(__cplusplus) && defined(CPU_FEATURES_ARCH_X86)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_INTERNAL_HWCAPS_H_


// Parsed from cpu_features/cpuinfo_aarch64.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_AARCH64_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_AARCH64_H_

// #include "cpu_features_macros.h"
// #include "cpu_features_cache_info.h"
// Targeting ../Aarch64Features.java


// Targeting ../Aarch64Info.java



@Namespace("cpu_features") public static native @ByVal Aarch64Info GetAarch64Info();

////////////////////////////////////////////////////////////////////////////////
// Introspection functions

/** enum cpu_features::Aarch64FeaturesEnum */
public static final int
  AARCH64_FP = 0,
  AARCH64_ASIMD = 1,
  AARCH64_AES = 2,
  AARCH64_PMULL = 3,
  AARCH64_SHA1 = 4,
  AARCH64_SHA2 = 5,
  AARCH64_CRC32 = 6,
  AARCH64_LAST_ = 7;

@Namespace("cpu_features") public static native int GetAarch64FeaturesEnumValue(@Const Aarch64Features features,
                                @Cast("cpu_features::Aarch64FeaturesEnum") int value);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetAarch64FeaturesEnumName(@Cast("cpu_features::Aarch64FeaturesEnum") int arg0);

// #if !defined(CPU_FEATURES_ARCH_AARCH64)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_AARCH64_H_


// Parsed from cpu_features/cpuinfo_arm.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_ARM_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_ARM_H_

// #include <stdint.h>  // uint32_t
// #include "cpu_features_macros.h"
// #include "cpu_features_cache_info.h"
// Targeting ../ArmFeatures.java


// Targeting ../ArmInfo.java



// TODO(user): Add macros to know which features are present at compile
// time.

@Namespace("cpu_features") public static native @ByVal ArmInfo GetArmInfo();

// Compute CpuId from ArmInfo.
@Namespace("cpu_features") public static native @Cast("uint32_t") int GetArmCpuId(@Const ArmInfo info);

////////////////////////////////////////////////////////////////////////////////
// Introspection functions

/** enum cpu_features::ArmFeaturesEnum */
public static final int
  ARM_SWP = 0,
  ARM_HALF = 1,
  ARM_THUMB = 2,
  ARM_26BIT = 3,
  ARM_FASTMULT = 4,
  ARM_FPA = 5,
  ARM_VFP = 6,
  ARM_EDSP = 7,
  ARM_JAVA = 8,
  ARM_IWMMXT = 9,
  ARM_CRUNCH = 10,
  ARM_THUMBEE = 11,
  ARM_NEON = 12,
  ARM_VFPV3 = 13,
  ARM_VFPV3D16 = 14,
  ARM_TLS = 15,
  ARM_VFPV4 = 16,
  ARM_IDIVA = 17,
  ARM_IDIVT = 18,
  ARM_VFPD32 = 19,
  ARM_LPAE = 20,
  ARM_EVTSTRM = 21,
  ARM_AES = 22,
  ARM_PMULL = 23,
  ARM_SHA1 = 24,
  ARM_SHA2 = 25,
  ARM_CRC32 = 26,
  ARM_LAST_ = 27;

@Namespace("cpu_features") public static native int GetArmFeaturesEnumValue(@Const ArmFeatures features, @Cast("cpu_features::ArmFeaturesEnum") int value);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetArmFeaturesEnumName(@Cast("cpu_features::ArmFeaturesEnum") int arg0);

// #if !defined(CPU_FEATURES_ARCH_ARM)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_ARM_H_


// Parsed from cpu_features/cpuinfo_mips.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_MIPS_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_MIPS_H_

// #include "cpu_features_macros.h"
// #include "cpu_features_cache_info.h"
// Targeting ../MipsFeatures.java


// Targeting ../MipsInfo.java



@Namespace("cpu_features") public static native @ByVal MipsInfo GetMipsInfo();

////////////////////////////////////////////////////////////////////////////////
// Introspection functions

/** enum cpu_features::MipsFeaturesEnum */
public static final int
  MIPS_MSA = 0,
  MIPS_EVA = 1,
  MIPS_R6 = 2,
  MIPS_LAST_ = 3;

@Namespace("cpu_features") public static native int GetMipsFeaturesEnumValue(@Const MipsFeatures features,
                             @Cast("cpu_features::MipsFeaturesEnum") int value);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetMipsFeaturesEnumName(@Cast("cpu_features::MipsFeaturesEnum") int arg0);

// #if !defined(CPU_FEATURES_ARCH_MIPS)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_MIPS_H_


// Parsed from cpu_features/cpuinfo_ppc.h

// Copyright 2018 IBM
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_PPC_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_PPC_H_

// #include "cpu_features_macros.h"
// #include "cpu_features_cache_info.h"
// #include "internal/hwcaps.h"
// Targeting ../PPCFeatures.java


// Targeting ../PPCInfo.java



// This function is guaranteed to be malloc, memset and memcpy free.
@Namespace("cpu_features") public static native @ByVal PPCInfo GetPPCInfo();
// Targeting ../PPCPlatformStrings.java



@Namespace("cpu_features") public static native @ByVal PPCPlatformStrings GetPPCPlatformStrings();

////////////////////////////////////////////////////////////////////////////////
// Introspection functions

/** enum cpu_features::PPCFeaturesEnum */
public static final int
  PPC_32 = 0,          /* 32 bit mode execution */
  PPC_64 = 1,          /* 64 bit mode execution */
  PPC_601_INSTR = 2,   /* Old POWER ISA */
  PPC_HAS_ALTIVEC = 3, /* SIMD Unit*/
  PPC_HAS_FPU = 4,     /* Floating Point Unit */
  PPC_HAS_MMU = 5,     /* Memory management unit */
  PPC_HAS_4xxMAC = 6,
  PPC_UNIFIED_CACHE = 7,  /* Unified instruction and data cache */
  PPC_HAS_SPE = 8,        /* Signal processing extention unit */
  PPC_HAS_EFP_SINGLE = 9, /* SPE single precision fpu */
  PPC_HAS_EFP_DOUBLE = 10, /* SPE double precision fpu */
  PPC_NO_TB = 11,          /* No timebase */
  PPC_POWER4 = 12,
  PPC_POWER5 = 13,
  PPC_POWER5_PLUS = 14,
  PPC_CELL = 15,  /* Cell broadband engine */
  PPC_BOOKE = 16, /* Embedded ISA */
  PPC_SMT = 17,   /* Simultaneous multi-threading */
  PPC_ICACHE_SNOOP = 18,
  PPC_ARCH_2_05 = 19, /* ISA 2.05 - POWER6 */
  PPC_PA6T = 20,      /* PA Semi 6T core ISA */
  PPC_HAS_DFP = 21,   /* Decimal floating point unit */
  PPC_POWER6_EXT = 22,
  PPC_ARCH_2_06 = 23,              /* ISA 2.06 - POWER7 */
  PPC_HAS_VSX = 24,                /* Vector-scalar extension */
  PPC_PSERIES_PERFMON_COMPAT = 25, /* Set of backwards compatibile performance
                                 monitoring events */
  PPC_TRUE_LE = 26,
  PPC_PPC_LE = 27,
  PPC_ARCH_2_07 = 28,      /* ISA 2.07 - POWER8 */
  PPC_HTM = 29,            /* Hardware Transactional Memory */
  PPC_DSCR = 30,           /* Data stream control register */
  PPC_EBB = 31,            /* Event base branching */
  PPC_ISEL = 32,           /* Integer select instructions */
  PPC_TAR = 33,            /* Target address register */
  PPC_VEC_CRYPTO = 34,     /* Vector cryptography instructions */
  PPC_HTM_NOSC = 35,       /* Transactions aborted when syscall made*/
  PPC_ARCH_3_00 = 36,      /* ISA 3.00 - POWER9 */
  PPC_HAS_IEEE128 = 37,    /* VSX IEEE Binary Float 128-bit */
  PPC_DARN = 38,           /* Deliver a random number instruction */
  PPC_SCV = 39,            /* scv syscall */
  PPC_HTM_NO_SUSPEND = 40, /* TM w/out suspended state */
  PPC_LAST_ = 41;

@Namespace("cpu_features") public static native int GetPPCFeaturesEnumValue(@Const PPCFeatures features, @Cast("cpu_features::PPCFeaturesEnum") int value);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetPPCFeaturesEnumName(@Cast("cpu_features::PPCFeaturesEnum") int arg0);

// #if !defined(CPU_FEATURES_ARCH_PPC)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_PPC_H_


// Parsed from cpu_features/cpuinfo_x86.h

// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// #ifndef CPU_FEATURES_INCLUDE_CPUINFO_X86_H_
// #define CPU_FEATURES_INCLUDE_CPUINFO_X86_H_

// #include "cpu_features_cache_info.h"
// #include "cpu_features_macros.h"
// Targeting ../X86Features.java


// Targeting ../X86Info.java



// Calls cpuid and returns an initialized X86info.
// This function is guaranteed to be malloc, memset and memcpy free.
@Namespace("cpu_features") public static native @ByVal X86Info GetX86Info();

// Returns cache hierarchy informations.
// Can call cpuid multiple times.
// Only works on Intel CPU at the moment.
// This function is guaranteed to be malloc, memset and memcpy free.
@Namespace("cpu_features") public static native @ByVal CacheInfo GetX86CacheInfo();

/** enum cpu_features::X86Microarchitecture */
public static final int
  X86_UNKNOWN = 0,
  INTEL_CORE = 1,      // CORE
  INTEL_PNR = 2,       // PENRYN
  INTEL_NHM = 3,       // NEHALEM
  INTEL_ATOM_BNL = 4,  // BONNELL
  INTEL_WSM = 5,       // WESTMERE
  INTEL_SNB = 6,       // SANDYBRIDGE
  INTEL_IVB = 7,       // IVYBRIDGE
  INTEL_ATOM_SMT = 8,  // SILVERMONT
  INTEL_HSW = 9,       // HASWELL
  INTEL_BDW = 10,       // BROADWELL
  INTEL_SKL = 11,       // SKYLAKE
  INTEL_ATOM_GMT = 12,  // GOLDMONT
  INTEL_KBL = 13,       // KABY LAKE
  INTEL_CFL = 14,       // COFFEE LAKE
  INTEL_CNL = 15,       // CANNON LAKE
  AMD_HAMMER = 16,      // K8
  AMD_K10 = 17,         // K10
  AMD_BOBCAT = 18,      // K14
  AMD_BULLDOZER = 19,   // K15
  AMD_JAGUAR = 20,      // K16
  AMD_ZEN = 21;         // K17

// Returns the underlying microarchitecture by looking at X86Info's vendor,
// family and model.
@Namespace("cpu_features") public static native @Cast("cpu_features::X86Microarchitecture") int GetX86Microarchitecture(@Const X86Info info);

// Calls cpuid and fills the brand_string.
// - brand_string *must* be of size 49 (beware of array decaying).
// - brand_string will be zero terminated.
// - This function calls memcpy.
@Namespace("cpu_features") public static native void FillX86BrandString(@Cast("char*") BytePointer brand_string);
@Namespace("cpu_features") public static native void FillX86BrandString(@Cast("char*") ByteBuffer brand_string);
@Namespace("cpu_features") public static native void FillX86BrandString(@Cast("char*") byte[] brand_string);

////////////////////////////////////////////////////////////////////////////////
// Introspection functions

/** enum cpu_features::X86FeaturesEnum */
public static final int
  X86_FPU = 0,
  X86_TSC = 1,
  X86_CX8 = 2,
  X86_CLFSH = 3,
  X86_MMX = 4,
  X86_AES = 5,
  X86_ERMS = 6,
  X86_F16C = 7,
  X86_FMA3 = 8,
  X86_VAES = 9,
  X86_VPCLMULQDQ = 10,
  X86_BMI1 = 11,
  X86_HLE = 12,
  X86_BMI2 = 13,
  X86_RTM = 14,
  X86_RDSEED = 15,
  X86_CLFLUSHOPT = 16,
  X86_CLWB = 17,
  X86_SSE = 18,
  X86_SSE2 = 19,
  X86_SSE3 = 20,
  X86_SSSE3 = 21,
  X86_SSE4_1 = 22,
  X86_SSE4_2 = 23,
  X86_AVX = 24,
  X86_AVX2 = 25,
  X86_AVX512F = 26,
  X86_AVX512CD = 27,
  X86_AVX512ER = 28,
  X86_AVX512PF = 29,
  X86_AVX512BW = 30,
  X86_AVX512DQ = 31,
  X86_AVX512VL = 32,
  X86_AVX512IFMA = 33,
  X86_AVX512VBMI = 34,
  X86_AVX512VBMI2 = 35,
  X86_AVX512VNNI = 36,
  X86_AVX512BITALG = 37,
  X86_AVX512VPOPCNTDQ = 38,
  X86_AVX512_4VNNIW = 39,
  X86_AVX512_4VBMI2 = 40,
  X86_PCLMULQDQ = 41,
  X86_SMX = 42,
  X86_SGX = 43,
  X86_CX16 = 44,
  X86_SHA = 45,
  X86_POPCNT = 46,
  X86_MOVBE = 47,
  X86_RDRND = 48,
  X86_DCA = 49,
  X86_SS = 50,
  X86_LAST_ = 51;

@Namespace("cpu_features") public static native int GetX86FeaturesEnumValue(@Const X86Features features, @Cast("cpu_features::X86FeaturesEnum") int value);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetX86FeaturesEnumName(@Cast("cpu_features::X86FeaturesEnum") int arg0);

@Namespace("cpu_features") public static native @Cast("const char*") BytePointer GetX86MicroarchitectureName(@Cast("cpu_features::X86Microarchitecture") int arg0);

// #if !defined(CPU_FEATURES_ARCH_X86)
// #endif
  

// #endif  // CPU_FEATURES_INCLUDE_CPUINFO_X86_H_


}
