SUMMARY = "Engine.IO server."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = "python-six \
"

PYPI_PACKAGE = "python-engineio"

SRC_URI[md5sum] = "6a029514857b60441caf005ce8d6c65a"
SRC_URI[sha256sum] = "ab78658ffc80b7e8fa0fb66bdf2c928961019294d8e02f2eca69d8613a663001"

PR = "r3"

inherit pypi setuptools
