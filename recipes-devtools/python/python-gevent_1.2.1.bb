SUMMARY = "Coroutine-based network library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2dbb33d00e1fd31c7041460a81ac0bd2"

DEPENDS += "python-greenlet \
            python-pip \
"

RDEPENDS_${PN} += "libgcc \
                   python-greenlet \
                   python-mime \
                   python-pprint \
                   python-re \
                   python-ctypes \
"

SRC_URI = "file://0001-Patch-out-configure-since-it-breaks-cross-compile.patch"
SRC_URI[md5sum] = "6700a2433c8e0635425e6798760efc81"
SRC_URI[sha256sum] = "3de300d0e32c31311e426e4d5d73b36777ed99c2bac3f8fbad939eeb2c29fa7c"

PR = "r17"

inherit pypi setuptools

do_configure_append () {
  cd deps/libev
  ./configure --host=${HOST_ARCH}
  cd ../c-ares
  ./configure --disable-dependency-tracking --host=${HOST_ARCH} CONFIG_COMMANDS=
  cd ../..
}
