DESCRIPTION = "Maxon EPOS2 servo controller C library"
HOMEPAGE = "http://www.maxonmotor.com/"
LICENSE = "PROPRIETARY"
LIC_FILES_CHKSUM = "file://doc/EPOS%20Command%20Library.pdf;md5=086cb8a1c1c825494a56179ad4302938"


SRC_URI = "file://EPOS-Linux-Library-En.zip"

# TODO: Adapt to non-raspberry
S = "${WORKDIR}/EPOS_Linux_Library/lib/arm/hf/"
#S = "${WORKDIR}/EPOS_Linux_Library/lib/x86"

do_install () {
  install -d ${D}${libdir}
  install -m 0755 ${S}/libEposCmd.so.${PV} ${D}${libdir}/libEposCmd.so
  install -m 0755 ${S}/libftd2xx.so.* ${D}${libdir}
}

FILES_${PN} = "${libdir}/*.so*"
FILES_${PN}-dev = ""
