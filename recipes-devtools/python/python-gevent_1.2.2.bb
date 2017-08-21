SUMMARY = "Coroutine-based network library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4de99aac27b470c29c6c309e0c279b65"

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
SRC_URI[md5sum] = "7f0baf355384fe5ff2ecf66853422554"
SRC_URI[sha256sum] = "4791c8ae9c57d6f153354736e1ccab1e2baf6c8d9ae5a77a9ac90f41e2966b2d"

PR = "r19"

inherit pypi setuptools

do_configure_append () {
  cd deps/libev
  ./configure --host=${HOST_ARCH}
  cd ../c-ares
  ./configure --disable-dependency-tracking --host=${HOST_ARCH} CONFIG_COMMANDS=
  cd ../..
}
