Summary="DNP3 stack"
SECTION="libs"
DEPENDS="boost asio"
LICENSE="Apache-2.0"
SRC_URI = "https://github.com/automatak/dnp3/archive/2.2.0.tar.gz \
           file://${THISDIR}/files/dnp3-${PV}.diff \
           file://0001-Get-packages-to-work.patch \
           "
SRC_URI[md5sum] = "38bc0a52c2a9aa3625df458a285f1f35"
SRC_URI[sha256sum] = "4ffda0892e26fbac5cbdea9537b5bff5b38341e7b9a165d45a3964a9b73b4c8b"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"
inherit cmake
#FILEEXTRAPATHS_prepend := "${THISDIR}/files/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
S="${WORKDIR}/dnp3-${PV}"
