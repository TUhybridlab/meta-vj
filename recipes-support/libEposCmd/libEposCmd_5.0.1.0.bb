DESCRIPTION = "Maxon EPOS2 servo controller C library"
HOMEPAGE = "http://www.maxonmotor.com/"
LICENSE = "PROPRIETARY"
LIC_FILES_CHKSUM = "file://doc/EPOS%20Command%20Library.pdf;md5=086cb8a1c1c825494a56179ad4302938"


SRC_URI = "file://EPOS-Linux-Library-En.zip"
S = "${WORKDIR}/EPOS_Linux_Library"

# TODO: Adapt to non-raspberry
ARCH_DIR = "arm/hf"
#ARCH_DIR ="x86"

do_install () {
  install -d ${D}${libdir}
  install -m 0755 ${S}/lib/${ARCH_DIR}/libEposCmd.so.${PV} ${D}${libdir}/libEposCmd.so
  install -m 0755 ${S}/lib/${ARCH_DIR}/libftd2xx.so.* ${D}${libdir}
}

FILES_${PN} = "${libdir}/*.so*"
FILES_${PN}-dev = ""
