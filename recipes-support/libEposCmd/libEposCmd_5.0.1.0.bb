DESCRIPTION = "Maxon EPOS2 servo controller C library"
HOMEPAGE = "http://www.maxonmotor.com/"
LICENSE = "PROPRIETARY"
LIC_FILES_CHKSUM = "file://doc/EPOS%20Command%20Library.pdf;md5=086cb8a1c1c825494a56179ad4302938"

RDEPENDS_${PN} = "glibc \
                  gcc-runtime \
"

SRC_URI = "http://www.maxonmotor.com/medias/sys_master/root/8815100330014/EPOS-Linux-Library-En.zip"
SRC_URI[md5sum] = "3e283ecec95542bc40465fb68d764e23"
SRC_URI[sha256sum] = "42ff5a3ee2aeb7338610bd073e624e2adc7b3e0393f8e617db603a661656a4e1"

S = "${WORKDIR}/EPOS_Linux_Library"

# TODO: Adapt to non-raspberry
ARCH_DIR = "arm/hf"
#ARCH_DIR ="x86"

# Package Revision, Update this whenever you change the recipe.
PR = "r2"

do_install () {
  install -d ${D}${libdir}
  install -m 0755 ${S}/lib/${ARCH_DIR}/libEposCmd.so.${PV} ${D}${libdir}/libEposCmd.so
  install -m 0755 ${S}/lib/${ARCH_DIR}/libftd2xx.so.* ${D}${libdir}
}

FILES_${PN} = "${libdir}/*.so*"
FILES_${PN}-dev = ""
