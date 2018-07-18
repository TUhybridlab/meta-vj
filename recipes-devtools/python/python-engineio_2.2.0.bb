SUMMARY = "Engine.IO server."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42d0a9e728978f0eeb759c3be91536b8"

RDEPENDS_${PN} = " \
  python-six \
  python-compression \
"

PYPI_PACKAGE = "python-engineio"

SRC_URI[md5sum] = "cf8868acedc242b30ad3d24060a8d8e1"
SRC_URI[sha256sum] = "d35c50db73bf372f82975dc87f18f1cbfab7d5bed2dfc2553ae784579502a461"

PR = "r0"

inherit pypi setuptools
