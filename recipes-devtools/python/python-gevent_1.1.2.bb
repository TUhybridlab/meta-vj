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
"

SRC_URI = "file://0001-Patch-out-configure-since-it-breaks-cross-compile.patch"
SRC_URI[md5sum] = "bb32a2f852a4997138014d5007215c6e"
SRC_URI[sha256sum] = "cb15cf73d69a2eeefed330858f09634e2c50bf46da9f9e7635730fcfb872c02c"

PR = "r11"

inherit pypi setuptools

do_configure_append () {
  cd libev
  ./configure --host=${HOST_ARCH}
  cd ../c-ares
  ./configure --host=${HOST_ARCH} CONFIG_COMMANDS= CONFIG_FILES=
  cd ..
}
