SUMMARY = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=56472ad6de4caf50e05332a34b66e778"

DEPENDS_${PN} += "python-greenlet \
"

SRC_URI[md5sum] = "fde857181347d5b7b921541367a99204"
SRC_URI[sha256sum] = "306373b8adda84b7d471f5829c59ca33f9438c8ecd34daf5cddde19d376caf21"

PR = "r0"

inherit pypi setuptools
