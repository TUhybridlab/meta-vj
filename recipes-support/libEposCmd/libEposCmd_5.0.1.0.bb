DESCRIPTION = "Maxon EPOS2 servo controller C library"
HOMEPAGE = "http://www.maxonmotor.com/"

# TODO: Find out and add file
LICENSE = "PROPRIETARY"
do_qa_configure () {
}
#LIC_FILES_CHKSUM = "file://LICENSE;md5="

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
